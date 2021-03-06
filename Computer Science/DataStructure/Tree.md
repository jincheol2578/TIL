# 트리(Tree)

node와 edge로 이루어진 자료구조

![img](https://www.geeksforgeeks.org/wp-content/uploads/binary-tree-to-DLL.png)

트리는 값을 가진 노드와 노드들을 연결해주는 간선(Edge)로 이루어져 있다.

최상위 노드가 루트(Root) 노드다.

모든 노드들은 0개 이상의 자식(Child) 노드를 갖고 있으며 보통 부모-자식 관계로 부른다.



### 트리(Tree)의 특징

1. 트리에는 사이클이 존재할 수 없다. (사이클이 만들어진다면 그래프임)
2. 모든 노드는 자료형으로 표현 가능하다.
3. 루트에서 한 노드로 경로는 유일한 경로 뿐이다.
4. 노드의 개수가 N개면, 간선은 N-1개를 가진다.



### 트리 순회 방식

1. **전위 순회(pre- order)**

   각 루트를 순차적으로 방문하는 방식 (Root -> 왼쪽자식 -> 오른쪽 자식)

2. **중위 순회(in-order)**

   왼쪽 하위 트리를 방문 후 루트(Root)를 방문하는 방식이다.

   (왼쪽 자식 → Root → 오른쪽 자식)

3. **후위 순회(post-order)**

   왼쪽 하위 트리부터 하위를 모두 방문 후 루트(Root)를 방문하는 방식이다.

   (왼쪽 자식 → 오른쪽 자식 → Root)

4. **레벨 순회(level-order)**

   루트(Root)부터 계층 별로 방문하는 방식이다.