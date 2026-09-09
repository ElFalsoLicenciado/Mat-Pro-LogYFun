# Funciones primitivas en Common Lisp

## append

APPEND function concatenates list arguments into one list. Resulting list is shallow copy of specified lists except for the last which is directly shared. See also MAPCAN, CONS, LIST, LIST*.

```commonlisp
append list (zero or more) => list

(append '(1 2 3)) => (1 2 3)
(append '(1 2 3) '(4 5 6) '(7 8 9)) => (1 2 3 4 5 6 7 8 9)
```

## assoc

ASSOC function searches supplied list for cons cell that have item as car part. Return value is the cell with key-value pair which key matched testing conditions, otherwise NIL. Default comparison operator is EQL.

Associative list, or for short alist, is a list with key-value pairs in cons cells. That is ((key1 . value1) (key2 . value2) ...)

```commonlisp
assoc item alist key (keyword) test (keyword) => cons cell or NIL
; item: A key object
; alist: List of cons cell with key-value pairs
; key: Function for extracting key before test
; test: Function key and item comparison

(assoc 'a '((a . 1) (b . 2) (c . 3))) => (A . 1)
(assoc 'x '((a . 1) (b . 2) (c . 3))) => NIL
```

## butlast

BUTLAST function returns the argument list copy without N last elements. See LAST.

```commonlisp
butlast list n (optional) => list

(butlast '(1 2 3)) => (1 2)
(butlast '(1 2 3) 2) => (1)
```

## car

> returns first element of the list.

CAR function returns the first element of list, that is the car part of its cons cell argument. CAR is identical to FIRST.

```commonlisp
car list => value
; list: Cons or Full list
(car '(1 2 3)) => 1
```

## cdr

> returns rest of the list, excluding first element of the list.

CDR function returns cdr part of cell in the argument, that is list of all elements but first. CDR is identical to REST.

```commonlisp
cdr list => value

(cdr '(1 2 3)) => (2 3)
(cdr (cons 'a 'b)) => B
(cdr (cons '(1 2 3) '(a b c))) => (A B C)
```

## cons

> creates a new list by adding an element to the beginning of the list.

CONS function make new cons object. The cons cell contains exactly two values. The first is named car, the second is named cdr. These cells are used to create one-way linked lists. See also CAR, CDR and LIST.

```commonlisp
cons car-part car-part => cons cell
; car-part: An object 
(cons 1 2) => (1 . 2)
(cons 1 (cons 2 (cons 3 nil))) => (1 2 3)
```

## first

FIRST function returns the first element of list, that is the car part of its cons cell argument. FIRST is identical to CAR.

```commonlisp
first list => value

first '(1 2 3)) => 1
(first (cons 'a 'b)) => A
```

## getf

GETF function searches supplied plist for value with matching key. Plist is list of even number of items. Each item pair specifies key and value. I.e. (K1 V1 K2 V2 ...). Return value is either value for first matching key, or specified default.

```commonlisp
getf place key default (optional) => value

; place: A place with list
; key: Keying value, also known as indicator
; default: Answer when key-value pair is not found, default is NIL
(getf '(a b 4 d a x) 'a) => B
(getf '(a b 4 d a x) 'x) => NIL
(getf '(a b 4 d a x) 'x 'not-found) => NOT-FOUND
```

## last

LAST function returns the list of N last elements of list argument. See BUTLAST.

```commonlisp
last list n (optional) => list

(last '(1 2 3)) => (3)
(last '(1 2 3) 0) => NIL
(last '(1 2 3) 1) => (3)
(last '(1 2 3) 2) => (2 3)
```

## list

LIST function makes new list from arguments.

```commonlisp
list list (zero or more) => list

(list 1 2 3) => (1 2 3)
(list 'a #c(1 2) "moo") => (A #C(1 2) "moo")
```

## list-length

LIST-LENGTH function computes length of the lists. LIST-LENGTH will return NIL if it encounters cyclic cons cell structure. LIST-LENGTH is slower than LENGTH because of additional cycle checking.

```commonlisp
list-length list => integer or NIL

(list-length '(a . (b . nil))) => 2
(list-length (list 'a 'b 'c)) => 3
```

## mapc

MAPC applies function FN to elements of lists with same index. Each application result forgotten. Elements are processed only up to length of the shortest list argument.

```commonlisp
mapc fn lists (one or more) => the first list from lists argument

(setq dummy nil) =>  NIL
(mapc #'(lambda (&rest x) (setq dummy (append dummy x)))
      '(1 2 3 4)
      '(a b c d e)
      '(x y z)) =>  (1 2 3 4)
dummy => (1 A X 2 B Y 3 C Z)
```

## member

MEMBER function searches a list for the first occurrence of an element (item) satisfying the test. Return value is tail of the list starting from found element or NIL when item is not found.

```commonlisp
member item list test (keyword) key (keyword) => tail or NIL

; item: An item to be found
; list: a list to be searched
; test: function key and item comparison
; key: function for extracting value before test

(member 1 '(0 1 0 0 0 1 0)) => (1 0 0 0 1 0)
(member 2 '(0 1 0 0 0 1 0)) => NIL
```

## null

NULL function returns true if the argument is NIL, otherwise it returns false.

```commonlisp
null object => T or NIL

(null '()) => T
(null '(1 2 3)) => NIL
(null nil) => T
```