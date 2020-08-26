import java.io.*;
import java.awt.*;

class StudentFile extends Frame
{
	TextField number,name,marks;
	Button enter,done;
	Label numberlabel1,namelabel1,marklabel1;
	DataOutputStream dos;
	public StudentFile()
	{
		super("Create Student File");
	}
	public void setup()
	{
		resize(400, 200);
		setLayout(new GridLayout(4,2));
		number = new TextField(25);
		numberlabel1 = new Label("Roll Number");
		name = new TextField(25);
		namelabel1 = new Label("Student Name");
		marks = new TextField(25);
		marklabel1 = new Label("Marks");
		enter = new Button("ENTER");
		done = new Button("DONE");
		add(numberlabel1);
		add(number);
		add(namelabel1);
		add(name);
		add(marklabel1);
		add(marks);
		add(enter);
		add(done);
		show();
		try
		{
			dos = new DataOutputStream(new FileOutputStream("student.txt"));
		}
		catch(IOException e)
		{
			System.err.println(e.toString());
			System.exit(1);
		}
	}
	public void addRecord()
	{
		int num;
		Double d;
		num = (new Integer(number.getText())).intValue();
		try
		{
			dos.writeInt(num);
			dos.writeUTF(name.getText());
			d = new Double(marks.getText());
			dos.writeDouble(d.doubleValue());
		}
		catch(IOException e){}
		number.setText(" ");
		name.setText(" ");
		marks.setText(" ");
	}
	public void cleanup()
	{
		if(!number.getText().equals(" "));
		{
			addRecord();
		}
		try
		{
			dos.close();
		} 
		catch (IOException e) {}
	}
	public boolean action(Event event, Object o)
	{
		if(event.target instanceof Button)
		{
			if(event.arg.equals("ENTER"))
			{
				addRecord();
				return true;
			}
		}
		return super.action(event, 0);
	}
	public boolean handleEvent(Event event)
	{
		if(event.target instanceof Button)
		{
			if(event.arg.equals("DONE"))
			{
				cleanup();
				System.exit(0);
				return true;
			}
		}
		return super.handleEvent(event);
	}
	public static void main(String args[])
	{
		StudentFile student = new StudentFile();
		student.setup();
	}
		
}