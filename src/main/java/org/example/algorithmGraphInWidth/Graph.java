package org.example.algorithmGraphInWidth;

public class Graph {
    private final int MAX_VALUE = 20;
    private VertexWidth vertexList[];
    private int adjMat[][];
    private int nVertex;

    private StackX theStack;

    public Graph() {
        adjMat = new int[MAX_VALUE][MAX_VALUE];
        vertexList = new VertexWidth[MAX_VALUE];
        nVertex = 0;
        for (int i = 0; i < MAX_VALUE; i++)
            for (int j = 0; j < MAX_VALUE; j++)
                adjMat[i][j] = 0;
        theStack = new StackX();
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void addVertex(char lab) {
        vertexList[nVertex++] = new VertexWidth(lab);
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].symbol);
    }

    public void dfs() // Обход в глубину
    { // Алгоритм начинает с вершины 0
        vertexList[0].wasVisited = true; // Пометка
        displayVertex(0); // Вывод
        theStack.push(0); // Занесение в стек
        while( !theStack.isEmpty() ) // Пока стек не опустеет
        {
            // Получение непосещенной вершины, смежной к текущей
            int v = getAdjUnvisitedVertex( theStack.peek() );
            if(v == -1) // Если такой вершины нет,
                theStack.pop(); // элемент извлекается из стека
            else // Если вершина найдена
            {
                vertexList[v].wasVisited = true; // Пометка
                displayVertex(v); // Вывод
                theStack.push(v); // Занесение в стек
            }
        }
        // Стек пуст, работа закончена
        for(int j=0; j<nVertex; j++) // Сброс флагов
            vertexList[j].wasVisited = false;
    }
    public int getAdjUnvisitedVertex(int v)
    {
        for(int j=0; j<nVertex; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j; // Возвращает первую найденную вершину
        return -1; // Таких вершин нет
    }

}
