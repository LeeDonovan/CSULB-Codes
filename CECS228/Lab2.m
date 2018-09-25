%Nathan Gardner
%Andres Aguilar
%Donovan Lee
%Jason Ortiz
f = [0,0,0,0,1,1,1,1];
v = [0,0,1,1,0,0,1,1];
c = [0,1,0,1,0,1,0,1];
a2 = and(and(f,c),~v);
b2 = or(~c,or(f,v));
c2 = and(~f,~v);
d2 = and(~v,c);
display(a2)
display(b2)
display(c2)
display(d2)
