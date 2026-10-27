% Consulta sin corte
p(X,Y) :- X > 15, Y > 50.
p(X,Y) :- X > Y.
% Consulta con corte
r(X,Y) :- X > 15, !, Y > 50.
r(X,Y) :- X > Y.