t=0:0.01:1;
f=1;
% sin wave
x = sin(2*pi*f*t);
% cosine wave
y = cos(2*pi*f*t);

plot(t,x,t,y);
title('Sin & Cosine Both Curves on Single Plot')
ylabel('Time→');
xlabel('Sin & Cos values→')