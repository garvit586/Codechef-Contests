from math import sin, cos, acos

def polyArea(x,y):
    return 0.5*np.abs(np.dot(x,np.roll(y,1))-np.dot(y,np.roll(x,1)))

def euclideanDistance(A,B):
    return ((A[0]-B[0])**(2) + (A[1]-B[1])**(2))**(1/2)

def angleVertix(O,A,B):
    module = euclideanDistance(A,O)*euclideanDistance(O,B)
    scalar = (O[0]-A[0])*(O[0]-B[0])+(O[1]-A[1])*(O[1]-B[1])
    return acos(scalar/module)
    
T = int(input())
 
for _ in range(T): 
    N,Q = map(int, input().split())
    anglesCoeffSum = 0
    perimeter = 0
    manualArea= 0 
    vertices = []
    firstVertix = 0
    
    for n in range(N): 
        x,y = map(int, input().split())
        vertices.append([x,y])
    
    
    for i in range(len(vertices)):
        v = vertices[i]
        prev = vertices[len(vertices)-1]
        adj = vertices[0]
        
        if i != len(vertices)-1: 
            adj = vertices[i+1]
        
        if i != 0:
            prev = vertices[i-1]
        
        side = euclideanDistance(adj,v)
        perimeter += side
        a = angleVertix(v, prev,  adj)
        anglesCoeffSum += (1/sin(a))*(1+cos(a))
        manualArea += ((v[0]*adj[1])-(v[1]*adj[0]))
        
    for q in range(Q):
        t,v = map(int, input().split())
        s = t*v
        
        print(abs(manualArea)/2 + perimeter*s + anglesCoeffSum*(s**(2)))
