% Generate a Plot of Sawtooth Wave
% Generate a Sawtooth Wave of 50Hz

T = 10*(1/50);
fs = 1000;
dt = 1/fs;
t = 0:dt:T-dt;
x = sawtooth(2*pi*50*t);
plot(t,x);
title('Sawtooth Wave');
xlabel('Time→');
ylabel('Amplitude→');
grid on