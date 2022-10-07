# Top50ArrayCodingProblems
Your Task
Write a function
findTheNumberPlate

which takes the Customer ID as an argument, calculates the Number Plate corresponding to this ID and returns it as a string;

Rules
The serial number changes first. For each 3-letter series it goes through 001 to 999, such as: aaa001, aaa002, aaa003, ......, aaa998, aaa999

The leftmost letter in the series switches alphabetically each time after the serial number has moved through 001 to 999 inclusively;

aaa001...aaa999
at this point the leftmost letter will switch alphabetically, while the serial number repeats the same cycle again;

baa001...baa999,
...... ,
zaa001...zaa999
The middle letter switches alphabetically each time after the leftmost letter has moved through a to z and the z** series has moved through 001 to 999.

zaa001...zaa999
at this point the middle letter will switch alphabetically, while the leftmost letter and the serial number repeat the same cycle again;

aba001...aba999,
bba001...bba999,
......,
zza001...zza999
The rightmost letter switches alphabetically each time after the middle letter has moved through a to z and the zz* series has moved through 001 to 999.

zza001...zza999
at this point the rightmost letter will switch alphabetically, while the middle letter, the leftmost letter, and the serial number repeat the same cycle again;

aab001...aab999,
bab001...bab999,
......,
zab001...zab999,
abb001...abb999,
bbb001...bbb999,
......,
zbb001...zbb999,
acb001...acb999,
......, 
zzz001...zzz999
