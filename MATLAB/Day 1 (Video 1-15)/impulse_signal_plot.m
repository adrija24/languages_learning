% How to Generate & Plot Impulse Signal in MATLAB
n = -10:10;
u = [zeros(1,10) 1 zeros(1,10)];
stem(n,u);
axis([-12 12 -1 2]);
xlabel('←time→')