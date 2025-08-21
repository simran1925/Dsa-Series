package Recursion.Q23_MColoring;

import java.util.ArrayList;
import java.util.List;

public class Q23_MColoring_Optimal
{
    public static boolean graphColoring(List<Integer>[]G, int[] colors, int index, int C)
    {
        //given example:
//                 1
//                / \
//               0---2
//                \ /
//                 3
        //initially
//        colors = [0,0,0,0]    -> to write the color no. (index 0 is for vertex 0, index 1 is for vertex 1 and similarly so on]
//        graph:
        //we have to find these values by analzying the given graph
//        G[0]= {1,3,2},
//        G[1]={0,2},
//        G[2]={1,3,0};
//        G[3]= {2,0};

        if(index==G.length)    //it means all the vertexes (nodes) has been colored -> with satisfying the conditions
        {
            return true;
        }

        for(int i=1;i<=C;i++)    //we will try for every color
        {
            if(isSafe(G,index,colors,C))    //very important to check whether we can add the specific color
            {
                colors[index]=i;       //assign the color number to the vertex

                if(graphColoring(G,colors,index+1,C))    //recursive function for next vertex
                {
                    return true;
                }

                colors[index]=0;           //un-assgin the color number to vertex(this time assigning 0 means no color)
            }
        }

        return false;
    }

    public static boolean isSafe(List<Integer>[]G ,int index,int[] colors,int C)
    {
        //suppose we are checking for vertex 0 , then for vertex 0, we have   G[0]= {1,3,2},
        // it means the adjacent vertexes of vertex 0 are 1,3,2 we will check the color on each adjacent vertex
          for(int i: G[index])
          {
              //indexes of colors array is according to the vertex number colors[1] means the color for vertex 1
              if(colors[i]==C) //if the current color is already assigned to the any of the adjacent vertex then false should be returned it means that particular color cannot be assigned to the current node or vertex
              {
                  return false;
              }
          }
          return true;
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        List< Integer >[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList < > ();
        }
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
        int[] color = new int[N];
        boolean ans = graphColoring(G, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}


//if even all the commments the approach is not cleared then the following is the depth and each iteration
/*🎯 Graph Used in Code
Let’s draw it from these lines:

java
        Copy
Edit
G[0].add(1);   G[1].add(0);
G[1].add(2);   G[2].add(1);
G[2].add(3);   G[3].add(2);
G[3].add(0);   G[0].add(3);
G[0].add(2);   G[2].add(0);
This forms a cycle with a diagonal:

lua
        Copy
Edit
     1
             / \
             0---2
             \ /
             3
Adjacency List:
Copy
        Edit
G[0] = [1, 3, 2]
G[1] = [0, 2]
G[2] = [1, 3, 0]
G[3] = [2, 0]
        🧩 Colors Array:
Initially:

java
        Copy
Edit
colors = [0, 0, 0, 0]
Here:

        0 → uncolored

1, 2, 3 → available colors

🔄 Let's Simulate the Full Backtracking Flow
Let’s walk through the recursive calls:

        🟩 Start: graphColoring(G, [0,0,0,0], 0, 3)
Try assigning colors to vertex 0

Loop over colors i = 1 to 3:

Try color[0] = 1

Call isSafe(G, 0, [0,0,0,0], 1)

Check neighbors of 0 → all uncolored → ✅ Safe

Assign → colors = [1, 0, 0, 0]

Recurse → graphColoring(G, [1,0,0,0], 1, 3)

🟨 index = 1
Try colors for vertex 1

Loop i = 1 to 3:

Try color[1] = 1

isSafe: G[1] = [0,2] → color[0] = 1 ❌ Conflict

Try color[1] = 2

isSafe: color[0] = 1, color[2] = 0 → ✅ Safe

Assign → colors = [1, 2, 0, 0]

Recurse → graphColoring(G, [1,2,0,0], 2, 3)

🟦 index = 2
Try colors for vertex 2

Loop i = 1 to 3:

Try color[2] = 1

G[2] = [1,3,0] → color[1] = 2, color[0] = 1 ❌ Conflict

Try color[2] = 2

color[1] = 2 ❌ Conflict

Try color[2] = 3

        ✅ Safe

Assign → colors = [1, 2, 3, 0]

Recurse → graphColoring(G, [1,2,3,0], 3, 3)

🟥 index = 3
Try colors for vertex 3

Loop i = 1 to 3:

G[3] = [2,0] → color[2] = 3, color[0] = 1

Try color[3] = 1

color[0] = 1 ❌ Conflict

Try color[3] = 2

        ✅ Safe

Assign → colors = [1, 2, 3, 2]

Recurse → graphColoring(G, [1,2,3,2], 4, 3)

🎉 index = 4 == N
→ All nodes colored successfully → return true

Backtrack all the way → final output: 1

        ✅ Final Answer:
ini
        Copy
Edit
colors = [1, 2, 3, 2]
That means:

Vertex 0 → color 1

Vertex 1 → color 2

Vertex 2 → color 3

Vertex 3 → color 2

And no adjacent nodes share the same color ✅

        📌 Key Functions Recap
graphColoring(...)
Tries all colors for a node

Recurse forward if safe

Backtrack if needed

isSafe(...)
Checks if current node can be colored with a given color

Valid only if none of its neighbors have the same color

🌈 Final Notes
This problem helps practice:

Backtracking

Graph traversal using adjacency list

Decision-making and undoing choices


*/
