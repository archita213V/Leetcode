class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        int [][] dist =new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=1;
        pq.offer(new int []{1,0,0});
        int [][] directions={
            {-1,-1},{-1,0},{-1,1},
            {0,-1},{0,1},{1,-1},
            {1,0},{1,1}
        };
        while(!pq.isEmpty()){
            int[]current=pq.poll();
            int d=current[0];
            int row=current[1];
            int col=current[2];
            if(d>dist[row][col]){
                continue;
            }
            if(row==n-1 && col==n-1){
                return d;
            }
            for(int[]dir:directions){
                int x_=row+dir[0];
                int y_=col+dir[1];
                if(x_>=0 && x_<n &&
                y_>=0 && y_<n &&
                grid[x_][y_]==0){
                    int newdis=d+1;
                    if(newdis<dist[x_][y_]){
                        dist[x_][y_]=newdis;
                        pq.offer(new int[]{
                            newdis,
                            x_,
                            y_
                        });
                        }
                    }
                }
            }
            return -1;
        }
    }
