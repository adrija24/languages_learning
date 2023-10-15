% y = ae^(-cn);
% c = (-1/12)+j(pi/6);

n = 1:100;
a = 1;
c = (-1/12)+(pi/6)*1i; % here, 1i == j

y = a*exp(-c*n);

plot(n,real(y), n, imag(y));
title('Complex Exponential Signal Plot');