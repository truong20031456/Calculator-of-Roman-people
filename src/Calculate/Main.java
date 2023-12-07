package Calculate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class Calculate extends JFrame {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculate frame = new Calculate();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    @Serial
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private double calculateResult(String expression) throws Exception {
        String[] numbers = expression.split("[+-]");

        double result = 0;
        for (String num : numbers) {
            if (num.contains("*") || num.contains("/")) {
                String[] multiplyDivide = num.split("(?=[*/])|(?<=[*/])");
                double intermediateResult = Double.parseDouble(multiplyDivide[0]);

                for (int i = 1; i < multiplyDivide.length; i += 2) {
                    String operator = multiplyDivide[i];
                    double operand = Double.parseDouble(multiplyDivide[i + 1]);

                    if (operator.equals("*")) {
                        intermediateResult *= operand;
                    } else if (operator.equals("/")) {
                        if (operand != 0) {
                            intermediateResult /= operand;
                        } else {
                            throw new ArithmeticException("Division by zero");
                        }
                    }
                }
                result += intermediateResult;
            } else {
                result += Double.parseDouble(num);
            }
            if (result < 0) {
                throw new Exception("Subtraction results in a negative number");
            }
        }

        return result;
    }







    public Calculate() {
        new RomanNumeralConverter();
        setTitle("Caculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 586, 410);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Calculate anything you want to but you should be pay for it");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setBounds(0, 0, 572, 46);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(109, 72, 270, 30);
        getContentPane().add(textField);
        textField.setColumns(10);

        JButton textnumber1 = new JButton("1");
        textnumber1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber1.setForeground(new Color(255, 0, 0));
        textnumber1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "1";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);


            }
        });
        textnumber1.setBounds(109, 146, 56, 38);
        getContentPane().add(textnumber1);

        JButton textnumber2 = new JButton("2");
        textnumber2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "2";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber2.setForeground(Color.RED);
        textnumber2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber2.setBounds(202, 146, 56, 38);
        getContentPane().add(textnumber2);

        JButton textnumber3 = new JButton("3");
        textnumber3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "3";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber3.setForeground(Color.RED);
        textnumber3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber3.setBounds(295, 146, 56, 38);
        getContentPane().add(textnumber3);

        JButton textnumber4 = new JButton("4");
        textnumber4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "4";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber4.setForeground(Color.RED);
        textnumber4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber4.setBounds(109, 210, 56, 38);
        getContentPane().add(textnumber4);

        JButton textnumber5 = new JButton("5");
        textnumber5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "5";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber5.setForeground(Color.RED);
        textnumber5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber5.setBounds(202, 210, 56, 38);
        getContentPane().add(textnumber5);

        JButton textnumber6 = new JButton("6");
        textnumber6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "6";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber6.setForeground(Color.RED);
        textnumber6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber6.setBounds(295, 210, 56, 38);
        getContentPane().add(textnumber6);

        JButton textnumber7 = new JButton("7");
        textnumber7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "7";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber7.setForeground(Color.RED);
        textnumber7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber7.setBounds(109, 267, 56, 38);
        getContentPane().add(textnumber7);

        JButton textnumber8 = new JButton("8");
        textnumber8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "8";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }

        });
        textnumber8.setForeground(Color.RED);
        textnumber8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber8.setBounds(202, 267, 56, 38);
        getContentPane().add(textnumber8);

        JButton textnumber9 = new JButton("9");
        textnumber9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "9";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber9.setForeground(Color.RED);
        textnumber9.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber9.setBounds(295, 267, 56, 38);
        getContentPane().add(textnumber9);

        JButton textqual = new JButton("=");
        textqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                String updatedText = currentText + "=";

                if(!currentText.contains("=")) {
                    // Cập nhật textField với văn bản mới
                    textField.setText(updatedText);
                }}

            // Thêm số 1 vào văn bản hiện tại


        });
        textqual.setForeground(Color.RED);
        textqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textqual.setBounds(385, 146, 56, 38);
        getContentPane().add(textqual);

        JButton textplus = new JButton("+");
        textplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textplus.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String currentText = textField.getText();
                        String updatedText = currentText + "+";

                        // Loop through the characters array

                        if (!updatedText.contains("+" + "+")) {
                            textField.setText(updatedText);
                            // Break the loop once the condition is met
                        }

                    }
                });}}





        );
        textplus.setForeground(Color.RED);
        textplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textplus.setBounds(385, 210, 56, 38);
        getContentPane().add(textplus);

        JButton textminus = new JButton("-");
        textminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "-";

                // Cập nhật textField với văn bản mới
                if(!updatedText.contains("-"+"-")) {
                    textField.setText(updatedText);
                }}}


        );
        textminus.setForeground(Color.RED);
        textminus.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textminus.setBounds(385, 267, 56, 38);
        getContentPane().add(textminus);

        JButton textnumber0 = new JButton("0");
        textnumber0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "0";

                // Cập nhật textField với văn bản mới
                textField.setText(updatedText);
            }
        });
        textnumber0.setForeground(Color.RED);
        textnumber0.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textnumber0.setBounds(202, 325, 56, 38);
        getContentPane().add(textnumber0);

        JButton texttimes = new JButton("*");
        texttimes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "*";

                // Cập nhật textField với văn bản mới
                if(!updatedText.contains("*"+"*")) {
                    textField.setText(updatedText);
                }}}


        );
        texttimes.setForeground(Color.RED);
        texttimes.setFont(new Font("Tahoma", Font.PLAIN, 18));
        texttimes.setBounds(464, 146, 56, 38);
        getContentPane().add(texttimes);

        JButton textdivide = new JButton("/");
        textdivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();

                // Thêm số 1 vào văn bản hiện tại
                String updatedText = currentText + "/";

                if(!updatedText.contains("/"+"/")) {
                    textField.setText(updatedText);
                }

            }
        });
        textdivide.setForeground(Color.RED);
        textdivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textdivide.setBounds(464, 210, 56, 38);
        getContentPane().add(textdivide);

        JButton btnResult = new JButton("Result");
        btnResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                // Kiểm tra xem có phải đã có dấu '=' trong văn bản không
                if (!currentText.contains("=")) {
                    // Tính kết quả từ biểu thức nhập vào
                    double result = 0;
                    try {
                        result = calculateResult(currentText);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }


                    // Convert the result to a Roman numeral
                    String romanResult = RomanNumeralConverter.toRoman((int) result);


                    // Hiển thị kết quả trên textField
                    textField.setText(currentText + "=" + romanResult);
                }
            }

        });
        btnResult.setForeground(Color.RED);
        btnResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnResult.setBounds(420, 72, 110, 38);
        getContentPane().add(btnResult);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {



                // Thêm số 1 vào văn bản hiện tại



                // Cập nhật textField với văn bản mới
                textField.setText("");

            }
        });

        btnDelete.setForeground(Color.RED);
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnDelete.setBounds(410, 325, 135, 38);
        getContentPane().add(btnDelete);

    }
    public class RomanNumeralConverter {
        private final static TreeMap<Integer, String> map = new TreeMap<>();

        static {
            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");
        }

        public static String toRoman(int number) {
            int l = map.floorKey(number);
            if (number == l) {
                return map.get(number);
            }
            return map.get(l) + toRoman(number - l);
        }
    }
}
