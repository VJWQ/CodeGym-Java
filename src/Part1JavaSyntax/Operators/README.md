
# Numeric Operators
## Unary operators
* Unary minus `-`: flips the number's sign.
* Increment `++`, decrement `--`
  - `x++`: postfix  
    `++x`: prefix
## Compound operators
* `+=`, `-=`, `*=`, `/=`, `%=`
## Logical operators
* `!`: logical NOT. It flips the value of a boolean
* `&&`: logical AND. It returns true only if both operands are true.
* `||`: logical OR. It returns true when at least one of the operands is true.


# Bitwise operators
* `~`: bitwise NOT
* `&`: bitwise AND
* `|`: bitwise OR
* `^`: bitwise XOR (exclusive OR)
* `<<`: Shift left
* `>>`: Shift right

# Operator Precedence
All operations are performed from left to right, taking into account their precedence.

| Operators  | Precedence |
| ------------- | ------------- |
| postfix  | `expr++` `expr--`  |
| unary  | `++expr` `--expr` `+expr` `~` `!`  |
| Multiplicative  | `*` `/` `%`  |
| additive  | `+` `-`  |
| shift  | `<<` `>>` `>>>`  |
| relational  | `<` `>` `<=` `>=` `instanceof`  |
| equality  | `==` `!=`  |
| bitwise AND  | `&`  |
| bitwise exclusive OR  | `^`  |
| bitwise inclusive OR  | `|`  |
| logical AND  | `&&`  |
| logical OR  | `||`  |
| ternary  | `?` `:`  |
| assignment  | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=`  |
