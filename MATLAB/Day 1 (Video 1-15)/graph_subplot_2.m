t=0:0.01:1;
f=10;
x = sin(2*pi*f*t);
y = cos(2*pi*f*t);
subplot(3,1,1);
plot(t,x);
title('Sin Curve on 1st Subplot')
ylabel('Time→');
xlabel('Sin values→')
subplot(3,1,2);
plot(t,y);
title('Cosine Curve on 2nd Subplot')
ylabel('Time→');
xlabel('Cos values→')
subplot(3,1,3);
plot(t,x,t,y);
title('Sin & Cosine Both Curves on 3rd Subplot')
ylabel('Time→');
xlabel('Cos values→')