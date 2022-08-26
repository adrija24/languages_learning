x=1:10;
y=x;
y2 = x.*x;
% subplot(row, column, position)
subplot(1,2,1)
plot(x,y)
xlabel('x-->')
ylabel('y-->')
title('x vs. y')
subplot(1,2,2)
plot(x,y2)
xlabel('x-->')
ylabel('y2-->')
title('x vs. y2')