import java.util.Array;
import java.util.collection;

public class que_5{

    int progressPercentage;
    String ExpectedEnddate;
    task(){
    Random random = new Random();
    this.progressPercentage = random.nextInt(101);
    this.expectedResult = "2024 -" +(random.nextInt(28)+1);

    }
    }

    class job{
        String title;
        list<Task>tasks;

        job(string title){
            this.title = title;
            this.tasks = generationRandomTask();

        }
        private List<Task> generateRandomTasks();
        Random random = new random();
        int numTasks = random.nextInt(11) +10;
        List<Task> tasklist = new ArrayList<>();
        
        for(int i=0;i<numTasks;i++){
            taskList.add(new Task());
        }
        return taskList;
    }

    double calculateOverallProgress(){
        if(tasks.isempty()) return 0;
        int totalProgress = tasks.stream().mapToInt(task -> task.progressPercentage).sum();
        return(double)totalProgress / tasks.size();
    
    }

    public class jobProgress{
        public staticvoid main(String args[]){
            List<job> jobs = generateRandomJobs();
            sortAndPrintJobs(jobs);
        }

        private static list<job> generateRandomJobs(){
            List<job> Joblist = new ArrayList<>();
            for(int i=1; i<=10; i++){
                jobList.add(new JOb("job" + i));
            }
            return jobList;
        }
        private static void sortAndPrintJobs(List<job>jobs){
          collections.sort(job,comparator.comparing(job ->job.tasks.get(0).ExpectedEndDate));

          for(Job job :jobs){
            double overallProgress = job.calculateOverallProgress();
            System.out.println("job" +job.title + ", Expected End date" +job.tasks.get(0),expectedEndDate + ",overallProgress" ))
          }
        }
    }
    
