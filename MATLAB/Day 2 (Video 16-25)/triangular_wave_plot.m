% Generate a Plot of Triangular Wave

t = -10:0.01:10;

x = sawtooth(t);
subplot(2,1,1)
plot(t,x);
title('Sawtooth Wave');
xlabel('Time→');
ylabel('Amplitude→');

y = sawtooth(t,0.5);  % 0.5 to have the peak in the middle
subplot(2,1,2);
plot(t,y);
title('Triangular Wave');
xlabel('Time→');
ylabel('Amplitude→');