pragma solidity ^0.4.16;


library SafeMath {
  function mul(uint256 a, uint256 b) internal pure returns (uint256) {
    if (a == 0) {
      return 0;
    }
    uint256 c = a * b;
    assert(c / a == b);
    return c;
  }

  function div(uint256 a, uint256 b) internal pure returns (uint256) {
    uint256 c = a / b;
    
    return c;
  }

  function sub(uint256 a, uint256 b) internal pure returns (uint256) {
    assert(b <= a);
    return a - b;
  }

  function add(uint256 a, uint256 b) internal pure returns (uint256) {
    uint256 c = a + b;
    assert(c >= a);
    return c;
  }
}

contract Contract1 {
    using SafeMath for uint;
    using SafeMath for uint256;
    
    uint256 counter = 0;
    address owner = msg.sender;
    
    function add() public{
        require(msg.sender == owner);
        counter = counter.add(1);   
        
    }
    
    function getCounter() public constant returns (uint256) {
        return counter;
    }
    
}
