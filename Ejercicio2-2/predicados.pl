% • La Tierra es un planeta.
planeta(tierra).
% • La Luna no es un planeta.
\+planeta(luna).
% • La Luna es un satélite.
satelite(luna).
% • La Tierra gira alrededor del Sol.
giraalrededor(tierra, sol).
% • Todo planeta es un satélite.
satelite(X):- planeta(X).
% • Todo planeta gira alrededor del Sol.
giraAlrededor(X,sol):- planeta(X).
% • Algún planeta gira alrededor de la Luna.
% • Hay por lo menos un satélite.
% • Todos los perros del vecindario muerden a algún
% • Hay un cartero al que lo muerden todos los perros
% • Todos los carteros son mordidos por algún perro
% • Hay un perro que muerde a todos los carteros
% • Todos los perros que asustan a algún cartero, lo muerden
% • Hay un perro que muerde a todos los perros que muerden a algún cartero
% • Hay un solo perro que se muerde a sí mismo