% How to Generate and Plot Ramp Signal Plot in MATLAB
% Ramp= t*u(t)

t = -10:10;                         % Time range
u = [zeros(1,10) ones(1,11)];       % Unit Step Sequence

r = t.*u; % Ramp signal is only valid in positive value

plot(t,r);
title('Ramp Signal Plot');
xlabel('Time→');
ylabel('Amplitude→');
axis([-12 12 -1 11]); % x-axis -12 to 12 and y-axis -1 to 11