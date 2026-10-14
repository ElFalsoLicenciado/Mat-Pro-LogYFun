woman(mia).
woman(jody).
woman(yolanda).
playsAirGuitar(jody).
party.
happy(yolanda).                                   % Fact
listensToMusic(mia).                              % Fact
listensToMusic(yolanda):- happy(yolanda).         % Rule. Yolanda plays music if she's happy
playsAirGuitar(mia):- listensToMusic(mia).        % Rule. Mia plays air guitar if she's listening 2 music
playsAirGuitar(yolanda):- listensToMusic(yolanda).% Rule. Yolanda plays guitar if she's listening 2 music
% The ':-' should be read as "if" or "is implied by"
% Parts of a sentece: head :- body
% If a knowledge base contains a rule head  :-  body, and Prolog knows that body follows from the information in the knowledge base, then Prolog can infer head.
% Se usan los hechos para ver si una regla es verdadera o falsa.
