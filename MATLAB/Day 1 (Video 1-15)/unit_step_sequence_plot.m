% How to Generate & Plot Unit Step Sequence in MATLAB
n = -10:10;
u = [zeros(1,10) ones(1,11)];
stem(n,u);
axis([-12 12 -1 2]);