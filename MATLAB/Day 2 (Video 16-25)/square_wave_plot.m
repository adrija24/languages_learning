% How to Generate and Plot Square Wave in MATLAB

t = 1:0.1:100;
y = square(t, 50); % implements 50% value higher and 50% value lower

plot(t,y);

xlabel('Time');
ylabel('Amplitude');
title('Square Wave Plot');

axis([-1 101 -1.1 1.1]);