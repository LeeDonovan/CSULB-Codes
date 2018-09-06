function [x,y,z,a] = testcode228()

p=[0 0 0 0 1 1 1 1];
q=[0 0 1 1 0 0 1 1];
r=[0 1 0 1 0 1 0 1];

x = xor(or(q,r),p);
y = xor(and(q,r),p);
z = xor(and(q,r),p);
a = xor(and(p,q),r);

end