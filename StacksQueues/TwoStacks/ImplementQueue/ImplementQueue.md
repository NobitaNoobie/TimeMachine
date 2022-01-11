## Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (`push`, `peek`, `pop`, and `empty`).

### Implement the MyQueue class:

- `void push(int x)` Pushes element `x` to the back of the queue.
- `int pop()` Removes the element from the front of the queue and returns it.
- `int peek()` Returns the element at the front of the queue.
- `boolean empty()` Returns `true` if the queue is empty, `false` otherwise.

Notes:

- You must use only standard operations of a `stack`, which means only `push` to `top`, `peek`/`pop` from `top`, `size`, and `isEmpty` operations are valid.

____

## - push(1️⃣)

| `stack` | `helper` | Operation |
| ----------- | ----------- | ---- |
| _ | _ | `stack` elements are temporarily transferred to `helper` |
| 1️⃣ | _ | 1️⃣ is pushed to `stack` and then temporary `helper` elements are pushed back into `stack` |

*Queue looks like*: 1️⃣

## - push(2️⃣)

| `stack` | `helper` | Operation |
| ----------- | ----------- | ---- |
| _ | 1️⃣ | `stack` elements are temporarily transferred to `helper` |
| (end)2️⃣(top) | 1️⃣ | 2️⃣ is pushed to `stack` |
| (end)2️⃣1️⃣(top) | _ | `helper` elements are pushed back to `stack` |

*Queue looks like*: (end)2️⃣1️⃣(top)

## - push(3️⃣)

| `stack` | `helper` | Operation |
| ----------- | ----------- | ---- |
| _ | (end)1️⃣2️⃣(top) | `stack` elements are temporarily transferred to `helper` |
| (end)3️⃣(top) | (end)1️⃣2️⃣(top) | 3️⃣ is pushed to `stack` |
| (end)3️⃣2️⃣1️⃣(top) | _ | `helper` elements are pushed back to `stack` |

*Queue looks like*: (end)3️⃣2️⃣1️⃣(top)
