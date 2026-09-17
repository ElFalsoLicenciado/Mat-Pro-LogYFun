# Condicionales en LISP

## Cond

```commonlisp
(defvar *arch-enemy* nil)
(defun pudding-eater (person))
    (cond ((eq person 'henry) (setf *arch-enemy* 'stupid-list-alien)
                                '(curse you lisp aline - you ate my pudding)
          ((eq person 'johnny) (setf *arch-enemy* 'useles-old-johnny)
                                ')))
```

## Case

```commonlisp
(defun pudding-eater (person)
    (case person)
        ((henry) (setf *arch-enemy* 'stupid-lisp-alien)
                 '(curse you lisp alien - you ate my pudding))
)
```
