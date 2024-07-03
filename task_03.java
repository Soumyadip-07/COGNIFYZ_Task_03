import java.util.*;
class task
{
     String tname, des, date, stat;
    static Scanner sc=new Scanner(System.in);
    task(String tname, String des, String date, String stat)
    {
        this.tname= tname;
        this.des= des;
        this.date= date;
        this.stat= stat;
    }
    void display()
    {
        System.out.println(tname);
        System.out.println(des);
        System.out.println(date);
        System.out.println(stat);
    }
    public static void main(String args[])
    {
        System.out.println("***TASK MANAGEMENT SYSTEM***");
        int choice=0;
        List<task> newtask=new ArrayList<>();
        int slNo=1;
        int total=0;
        while(choice!=5)
        {
            System.out.println("1. Add Task.");
            System.out.println("2. View Task.");
            System.out.println("3. Edit Existing Task.");
            System.out.println("4. Delete Task.");
            System.out.println("5. Quit.");
            System.out.print("Enter your choice= ");
            choice= sc.nextInt(); 
            switch(choice)
            {
                case 1:
                    {
                        System.out.print("Enter the number of tasks you want to add: ");
                        int ar= sc.nextInt();
                        sc.nextLine();
                        for(int i=0;i<ar;i++)
                        {
                            System.out.print("Enter task name= ");
                            String tname= sc.nextLine();
                            System.out.print("Enter task's description= ");
                            String des= sc.nextLine();
                            System.out.print("Enter task's due date= ");
                            String date= sc.nextLine();
                            System.out.print("Enter task's status= ");
                            String stat= sc.nextLine();
                            newtask.add(new task(tname, des, date, stat));
                            System.out.println((slNo++) + " Task added successfully...");
                            total++;
                        }
                        break;
                    }
                case 2:
                    {
                        if(newtask.isEmpty())
                        {
                            System.out.println("No task to show...");
                        }
                        else
                        {
                            System.out.println("All tasks are as follows :- ");
                            for(int i=0; i<newtask.size();i++)
                            {
                                System.out.println("Sl No - "+(i+1));
                                newtask.get(i).display();
                                System.out.println();
                            }
                            System.out.println("Total "+total+" task present.");
                            System.out.println();
                        }
                        break;
                    }
                case 3:
                    {
                        if(newtask.isEmpty())
                        {
                            System.out.println("No task to edit...");
                        }
                        else
                        {
                            for(int i=0; i<newtask.size();i++)
                            {
                                System.out.println("Sl No - "+(i+1));
                                newtask.get(i).display();
                                System.out.println();
                            }
                            System.out.print("Enter the Sl No of the task to edit: ");
                            int sl= sc.nextInt();
                            if (sl>=1 && sl<=newtask.size()) 
                            {
                                task edittask = newtask.get(sl - 1);
                                System.out.println("1. Edit task's name.");
                                System.out.println("2. Edit task's description.");
                                System.out.println("3. Edit task's due date.");
                                System.out.println("3. Edit task's status.");
                                System.out.println("4. Back.");
                                System.out.print("Enter your choice= ");
                                int echoice;
                                echoice= sc.nextInt();
                                sc.nextLine();
                                switch(echoice)
                                {
                                    case 1:
                                        {
                                            System.out.print("Enter new task name= ");
                                            String newname= sc.nextLine();
                                            edittask.tname= newname;
                                            System.out.println("Task's name updated successfully...");
                                            for(int i=0; i<newtask.size();i++)
                                            {
                                                System.out.println("Sl No - "+(i+1));
                                                newtask.get(i).display();
                                                System.out.println();
                                            }
                                            break;
                                        }
                                    case 2:
                                        {
                                            System.out.print("Enter new task's description= ");
                                            String newdes= sc.nextLine();
                                            edittask.des= newdes;
                                            System.out.println("Task's description updated successfully...");
                                            for(int i=0; i<newtask.size();i++)
                                            {
                                                System.out.println("Sl No - "+(i+1));
                                                newtask.get(i).display();
                                                System.out.println();
                                            }
                                            break;
                                        }
                                    case 3:
                                        {
                                            System.out.print("Enter new due date= ");
                                            String newdate= sc.nextLine();
                                            edittask.date= newdate;
                                            System.out.println("Task's due date updated successfully...");
                                            for(int i=0; i<newtask.size();i++)
                                            {
                                                System.out.println("Sl No - "+(i+1));
                                                newtask.get(i).display();
                                                System.out.println();
                                            }
                                            break;
                                        }
                                    case 4:
                                        {
                                            System.out.print("Enter new status= ");
                                            String newstat= sc.nextLine();
                                            edittask.stat= newstat;
                                            System.out.println("Task's status updated successfully...");
                                            for(int i=0; i<newtask.size();i++)
                                            {
                                                System.out.println("Sl No - "+(i+1));
                                                newtask.get(i).display();
                                                System.out.println();
                                            }
                                            break;
                                        }
                                    default:
                                        {
                                            System.out.println("Invalid input...");
                                            System.out.println("Please enter a valid input...");
                                        }
                                } 
                            }
                            else 
                            {
                                System.out.println("Invalid index number.");
                                System.out.println("Please enter a valid index number...");
                            }
                        }
                        break;
                    }
                case 4:
                    {
                        if(newtask.isEmpty())
                        {
                            System.out.println("No task to delete...");
                        }
                        else
                        {
                            for(int i=0; i<newtask.size();i++)
                            {
                                System.out.println("Sl No - "+(i+1));
                                newtask.get(i).display();
                                System.out.println();
                            }
                            System.out.print("Enter the Sl No of the task to delete: ");
                            int sl= sc.nextInt();
                            if (sl>=1 && sl<=newtask.size()) 
                            {
                                newtask.remove(sl-1);
                                System.out.println("Task deleted.");
                            } 
                            else 
                            {
                            System.out.println("Invalid index.");
                            }
                        }
                        break;
                    }
                case 5:
                    {
                        System.out.println("Quiting...");
                        break;
                    }
                default:
                    {
                        System.out.println("Invalid input...");
                        System.out.println("Please enter a valid input...");
                    }
            }
        }
    }
}