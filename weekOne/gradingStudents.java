public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> new_grades = new ArrayList<Integer>();
        for(int i=0; i<grades.size(); i++){
            if(grades.get(i)<38)
                new_grades.add(grades.get(i));
            else{
                int temp = grades.get(i);
                while(temp%5!=0)
                    temp++;
                    
                if(temp-grades.get(i) < 3)
                    new_grades.add(temp);
                else
                    new_grades.add(grades.get(i)); 
                        
            }
        }
    
        return new_grades;
    }
