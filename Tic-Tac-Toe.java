//Tic Tac Toe Desktop Game Developed By Chinmay Karodpati
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class Tic extends Frame implements ActionListener
{
    int c=0;	// for Labeling O And X
    int x=0;	// for not selecting button after winning
    int z=0;	// for how many times button are clicked that helps to find out that if game is draw or not
	int y=0;	// for not selecting single button again
	int  button1=0;
	int  button2=0;
	int  button3=0;
	int  button4=0;
	int  button5=0;
	int  button6=0;
	int  button7=0;
	int  button8=0;
	int  button9=0;

    Button b1 = new Button("");
    Button b2 = new Button("");
    Button b3 = new Button("");
    Button b4 = new Button("");
    Button b5 = new Button("");
    Button b6 = new Button("");
    Button b7 = new Button("");
    Button b8 = new Button("");
    Button b9 = new Button("");

    Tic()
    {
        setBounds(100,100,800,800);
        setTitle("Tic - Tac - Toe");
        setLayout(new GridLayout(3,3));

        add(b1);
        b1.setBackground(Color.PINK);

        add(b2);
        b2.setBackground(Color.PINK);

        add(b3);
        b3.setBackground(Color.PINK);

        add(b4);
        b4.setBackground(Color.PINK);

        add(b5);
        b5.setBackground(Color.PINK);

        add(b6);
        b6.setBackground(Color.PINK);

       	add(b7);
        b7.setBackground(Color.PINK);

       	add(b8);
        b8.setBackground(Color.PINK);

       	add(b9);
        b9.setBackground(Color.PINK);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

    }

    Tic(String a,String b)
    {
        setBounds(500,100,500,500);
        setTitle(a); // for title
        setLayout(new FlowLayout());
        add(new Label(b)); // for label
    }

    public void actionPerformed(ActionEvent e)
    {
        Object ref = e.getSource();

        if(x==0)	// for not selcting button again after Winning
        {
            if((ref==b1) && (button1==0))	// button 1 And Comparing that single button not should be select again
            {
				z++;	// for counting how many buttons are clicked

                if(c==0)	// if c=0 it will print x and set c=1
                {
                    b1.setLabel("X");
                    c=1;
                }
                else
                {
                    b1.setLabel("O");
                    c=0;
                }

				button1++;	// increment button1 for not to be selected again
            }

            else if((ref==b2) && (button2==0)) // button 2
            {
				z++;

                if(c==0)
                {
                    b2.setLabel("X");
                    c=1;
                }
                else	// if c!=0 then it will set label of button to O
                {
                    b2.setLabel("O");
                    c=0;
                }

                button2++;

            }
            else if((ref==b3) && (button3==0)) // button 3
            {
				z++;

                if(c==0)
                {
                    b3.setLabel("X");
                    c=1;
                }
                else
                {
                    b3.setLabel("O");
                    c=0;
                }

                button3++;

            }
            else if((ref==b4) && (button4==0))// button 4
            {
				z++;

                if(c==0)
                {
                    b4.setLabel("X");
                    c=1;
                }
                else
                {
                    b4.setLabel("O");
                    c=0;
                }

				button4++;
            }
            else if((ref==b5) && (button5==0)) // button 5
            {
				z++;

                if(c==0)
                {
                    b5.setLabel("X");
                    c=1;
                }
                else
                {
                    b5.setLabel("O");
                    c=0;
                }

                button5++;


            }
            else if((ref==b6) && (button6==0))// button 6
            {
				z++;

                if(c==0)
                {
                    b6.setLabel("X");
                    c=1;
                }
                else
                {
                    b6.setLabel("O");
                    c=0;
                }

				button6++;

            }
            else if((ref==b7) && (button7==0)) // button 7
            {
				z++;

                if(c==0)
                {
                    b7.setLabel("X");
                    c=1;
                }
                else
                {
                    b7.setLabel("O");
                    c=0;
                }

                button7++;

            }
            else if((ref==b8) && (button8==0)) // button 8
            {
				z++;

                if(c==0)
                {
                    b8.setLabel("X");
                    c=1;
                }
                else
                {
                    b8.setLabel("O");
                    c=0;
                }

                button8++;

            }
            else if((ref==b9) && (button9==0)) // button 9
            {
				z++;

                if(c==0)
                {
                    b9.setLabel("X");
                    c=1;
                }
                else
                {
                    b9.setLabel("O");
                    c=0;
                }

				button9++;

            }

        }	 // End of if loop for checking that button will not going to click if game is Over


        // Following are the winning condition...

		if(z==9)	// logic for Game Draw
		{
			Tic f2 = new Tic("Game-Draw","Game-Draw");
			f2.setVisible(true);
		}
		else if((b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X")) || (b1.getLabel().equals("O") && b2.getLabel().equals("O") && b3.getLabel().equals("O")))
		{
			b1.setBackground(Color.CYAN);
			b2.setBackground(Color.CYAN);
			b3.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;	// here x is set to 1 it will not not allow Button to be click if Game is Over
		}

		else if((b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X")) || (b4.getLabel().equals("O") && b5.getLabel().equals("O") && b6.getLabel().equals("O")))
		{
			b4.setBackground(Color.CYAN);
			b5.setBackground(Color.CYAN);
			b6.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
		else if((b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X")) || (b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O")))
		{
			b7.setBackground(Color.CYAN);
			b8.setBackground(Color.CYAN);
			b9.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
		else if((b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X")) ||(b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O")))
		{
			b1.setBackground(Color.CYAN);
			b4.setBackground(Color.CYAN);
			b7.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);


			x=1;
		}
		else if((b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X")) ||(b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O")))
		{
			b2.setBackground(Color.CYAN);
			b5.setBackground(Color.CYAN);
			b8.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
		else if((b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")) || (b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")))
		{
			b3.setBackground(Color.CYAN);
			b6.setBackground(Color.CYAN);
			b9.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
		else if((b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X")) || (b1.getLabel().equals("O") && b5.getLabel().equals("O") && b9.getLabel().equals("O")))
		{
			b1.setBackground(Color.CYAN);
			b5.setBackground(Color.CYAN);
			b9.setBackground(Color.CYAN);

		    Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
		else if((b3.getLabel().equals("X") && b5.getLabel().equals("X") && b7.getLabel().equals("X")) || (b3.getLabel().equals("O") && b5.getLabel().equals("O") && b7.getLabel().equals("O")))
		{
			b3.setBackground(Color.CYAN);
			b5.setBackground(Color.CYAN);
			b7.setBackground(Color.CYAN);

			Tic f2 = new Tic("Game-Over","Game-Over");
			f2.setVisible(true);

			x=1;
		}
    }

    public static void main(String [] args)
    {
        Tic f1 = new Tic();
        f1.setVisible(true);
    }

}
