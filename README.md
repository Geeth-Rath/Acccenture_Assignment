Question
Imagine you are a teacher. At the end of the school year, you need to calculate the average marks of your students.
 The marks of the students are passed as an array of strings. Each student's detalls are provided in a string in the following format:
 <student><mark 1><mark 2><mark N>
 Return a string in the following format (without white- spaces):
 <student A>-<average mark>; <student B>- Kaverage mark>;
 Take the following into account:
 Any kind of separator can be used in the string. The mark is an integer from 1-10. If the mark is out of that range, discard it, and don't use it in the average calculation.

 Don't forget to think through any corner cases.
 Examples:
 Input: [Madeline Choi 5 5 6, Ethan Wyatt 8 9 10] Output: Madeline Choi-5; Ethan Wyatt-9;
 Input: [Denver Wagner 6 7 8, Ernie Gibbs 11 2] Output: Denver Wagner-7; Ernie Gibbs-2;
 Input: [Kim Ramos: 4 5 6, Giovanni Landry 10]
 10
 Output: Kim Ramos-5; Giovanni Landry-10;
 Input: [Henrietta Moon:5;5;8, Edwin Bonilla 100;]
 Output: Henrietta Moon-6; Edwin Bonilla-0;
 For this test you're using Java OpenJDK 12
 Feel free to add comments in your code explaining your solution.
