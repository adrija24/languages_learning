%Logical Operators in MATLAB
%AND          &
%OR           |
%NOT          ~

%--------------------------%

% NOT Operator %
a = 1;
% ans should be 0
~a

b = 100;
% ans should be 0
~b

c = 0;
% ans should be 1
~c

a = [1 1 1 0 0 0];
% ans should be 0 0 0 1 1 1
~a

%..........................%
% AND Operator %
a=1;
b=1;
% ans should be 1
a & b

a=1;
b=0;
% ans should be 0
a & b

a=0;
b=0;
% ans should be 0
a & b

a = [1 1 1 0 0 0];
b = [0 0 0 0 1 1];
% ans should be 0 0 0 0 0 0
a & b

%...........................%
% OR Operator %
a=1;
b=1;
% ans should be 1
a | b

a=1;
b=0;
% ans should be 1
a | b

a=0;
b=0;
% ans should be 0
a | b

a = [1 1 1 0 0 0];
b = [0 0 0 0 1 1];
% ans should be 1 1 1 0 1 1
a | b
