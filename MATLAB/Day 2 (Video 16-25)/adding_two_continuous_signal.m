% Adding Two Continuous Signals

t = 0:0.001:0.1;
f = 50;
wt = 2*pi*f*t;

x1 = sin(wt);
subplot(3,1,1);
plot(t,x1);
title('Sine Wave');
xlabel('Time→');
ylabel('Amplitude→');

x2 = cos(wt);
subplot(3,1,2);
plot(t,x2);
title('Cosine Wave');
xlabel('Time→');
ylabel('Amplitude→');

y = x1+x2;
subplot(3,1,3);
plot(t,y);
title('Addition Curve');
xlabel('Time→');
ylabel('Amplitude→');