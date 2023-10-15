% Relational Operators in MATLAB
%   <   >   <=  >=  ~=  ==

2<3 % ans will be 1 (true)
1>2 % ans will be 0 (false)

2<=3 % ans will be 1
2>=3 % ans will be 0

2~=3 % ans will be 1

2==3 % ans will be 0


a = [2 -1; -3 10];
a<0 % ans should be [0 1; 1 0]
a>0 % ans should be [1 0; 0 1]


b = [2 -1; -3 10];
c = [0 -2; -3 -1];
b<0 & c<0 % ans should be [0 1; 1 0]


d = [2 4 6; 8 10 12];
e = [5 5 5; 9 9 9];
d<e % ans should be [1 1 0; 1 0 0]

d==e % ans should be [0 0 0; 0 0 0]

d>=e % ans should be [0 0 1; 0 1 1]