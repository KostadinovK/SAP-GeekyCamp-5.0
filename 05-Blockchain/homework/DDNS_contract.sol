pragma solidity ^0.4.24;

contract DDNS {
    struct Domain{
        string name;
        uint ip;
        bool isFree;
    }
    
    Domain[] domains;
    uint balance = 100;
    address owner = msg.sender;
    function buyDomain(string domain) public payable { //the 'payable' modifier is needed in order to receive ETH. Read the docs for further info.
		Domain d = Domain(domain,0,false);
		require(d.isFree == true && msg.value == 1 ether && msg.sender.balance - 1 ether >= 0);
        owner.transfer(1);
        domains.push(d);
        
    }
    
    function compareStrings (string a, string b) view returns (bool){
       return keccak256(a) == keccak256(b);
   }
    
    function setIP(string domain, uint ip) public {
        require(owner == msg.sender);
        for(uint i = 0;i < domains.length;i++){
            if(compareStrings(domains[i].name,domain)){
                domains[i].ip = ip;
                break;
            }
        }
    }
    
    function getIP(string domain) public returns (uint) {
        for(uint i = 0; i < domains.length;i++){
            if(compareStrings(domains[i].name,domain)){
                return domains[i].ip;
            }
        }
        
        return 0;
    }
    
    function withdraw(uint value) public {
        require(owner == msg.sender);
        if(value <= balance){
            owner.transfer(value);
            balance -= value;
        }
    }
    
}