## 1. Converting binary String to Integer equivalent
```java
String binaryString = "1101";
int n = Integer.parseInt(binaryString , 2); 
```
- Output: `13`
- Explanation: `1101` = ...26 zeroes...1101 (because `int` is 32 bits)
__________________
## 2. Gray Code
| n = 1 | 
| ----------- |
| 0 |
| 1 |

| n = 2 | 
| ----------- |
| 00 |
| 11 |
| 11 |
| 00 |

From observation, 
- Write the (n-1)th gray code and add `0` in front of every code
- Reverse the gray code of (n-1)th and add `1` in front of every code
