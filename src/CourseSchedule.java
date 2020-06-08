import java.util.ArrayList;
import java.util.List;

class CourseSchedule {

    // https://leetcode.com/problems/course-schedule/\

    List<Integer>[] graph;
    boolean[] visited;
    boolean[] explored;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //creating adjacency list representation of the graph
        graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        visited = new boolean[numCourses];
        explored = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(isCyclic(i)){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCyclic(int u) {
        visited[u] = true;
        for(Integer v : graph[u]){
            if(!visited[v]){
                if(isCyclic(v)){
                    return true;
                }
            }
            else if(!explored[v]){
                return true;
            }
        }
        // explored all the adjacent vertices for vertex "u" and thus marking "u" as explored
        explored[u] = true;
        return false;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        System.out.println(new CourseSchedule().canFinish(numCourses, prerequisites));
    }
}