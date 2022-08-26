% Specifying line styles in Graphs
x=0:pi/50:pi;
y1 = sin(x)
y2 = sin(x-0.25)
color = sscanf(str(2:end),'%2x%2x%2x',[1 3])/255;
plot(x,y1,'b--',x,y2,'r.');
title('Two Sin Curves (diff values) on 1st Subplot')
ylabel('Time→');
xlabel('Sin values→')