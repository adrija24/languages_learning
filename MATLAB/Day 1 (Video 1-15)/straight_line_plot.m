% How to Generate & Plot Straight Line (y=ax+c) in MATLAB
x=1:100;
a=5;
c=20;
y = a*x+c;
plot(x,y);
xlabel('x (Input) →');
ylabel('y (Output) →');
title('y=ax+c Straight Line Plot');