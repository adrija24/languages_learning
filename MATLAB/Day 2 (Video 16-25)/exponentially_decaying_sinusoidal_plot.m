% Exponentially Decaying Sinusoidal Signal Plot in MATLAB
% y = ae^(-btsin(wt));

t = 0:0.001:1;
a = 60;
b = 2;
f = 10;

wt = 2*pi*f*t;
y = a*exp(-b*t).*sin(wt);

plot(t, y);
title('Exponentially Decaying Sinusoidal Curve');
xlabel('Time→');
ylabel('Amplitude→');