#!/usr/bin/env python
# coding: utf-8

# #  VECTOR AND MATRICES IN PYTHON NUMPY LIBRARY

# IMPORTING THE NUMPY LIBRARY

# In[ ]:

import numpy as np


# CREATING VECTOR AND MATRIX USING Numpy array

# In[ ]:


A = np.array([[1,2,3], [4,5,6]]) # matrix


# In[ ]:


print(A)
print(type(A)) # type of object
print(A.size) # overal size (total number of elements)
print(A.shape) # number rows vs columns
print(A.ndim) # number of dimensions: 1 for vectors, 2 for matrices


# In[ ]:


B = np.array([1,2,3,4]) #Vector


# In[ ]:


B


# In[ ]:


B.size


# In[ ]:


B.shape


# In[ ]:


type(B)


# CREATING MATRIX USING mat or matrix

# In[ ]:


N = np.matrix([c,d])
print(N)
print(type(N))
print(N.size)
print(N.shape)


# In[ ]:


M = np.mat([c,d])
print(M)
print(type(M))
print(M.size)
print(M.shape)


# Advantage of using mat function over array for matrix

# In[ ]:


M = np.array('1,2;3,4;5,6')
print(M)
print(type(M))
print(M.size)
print(M.shape)


# In[ ]:


M = np.mat('1,2;3,4;5,6')
print(M)
print(type(M))
print(M.size)
print(M.shape)


# CREATING VECTOR AND MATRIX USING random function

# In[ ]:


V = np.random.randn(3)
print(V)
print(type(V))
print(V.size)
print(V.shape)


# In[ ]:


M = np.random.randn(2,4)
print(M)
print(type(M))
print(M.size)
print(M.shape)


# CREATING VECTOR AND MATRIX USING arange

# In[ ]:


V = np.arange(8)
print(V)
print(type(V))
print(V.size)
print(V.shape)


# In[ ]:


M = np.arange(8).reshape(2,4)
print(M)
print(type(M))
print(M.size)
print(M.shape)


# ACCESS TO THE ELEMENTS OF THE ARRAY
#Access to specific elements/rows/columns:
# In[ ]:


print(V[1])

print(M[1,2])


# In[ ]:


print(V[:1])

print(V[:2])


# In[ ]:


print(np.round(M,2))
print(np.round(M[:,:1],2))
print(np.round(M[:1,:],2))
print(np.round(M[-1,:],2))

#Show the array by rows/columns: 
# In[ ]:


i = 0
for rows in M:
    i+=1
    print('row'+str(i), rows)
i = 0    
for cols in M:
    i+=1
    print('column'+str(i), cols)

#Iterating Over Arrays: nditer
# In[ ]:





# SPECIAL MATRICES
empty(shape[, dtype, order]):	                #Return a new array of given shape and type, without initializing entries.
empty_like(prototype[, dtype, order, subok]):	#Return a new array with the same shape and type as a given array.
eye(N[, M, k, dtype, order]):	                #Return a 2-D array with ones on the diagonal and zeros elsewhere.
identity(n[, dtype]):	                        #Return the identity array.
ones(shape[, dtype, order]):	                #Return a new array of given shape and type, filled with ones.
ones_like(a[, dtype, order, subok]):	        #Return an array of ones with the same shape and type as a given array.
zeros(shape[, dtype, order]):	                #Return a new array of given shape and type, filled with zeros.
zeros_like(a[, dtype, order, subok]):	        #Return an array of zeros with the same shape and type as a given array.Some examples:
# In[ ]:


np.eye(4)


# In[ ]:


np.identity(3)


# In[ ]:


np.ones(5)


# In[ ]:


np.ones((3,2))


# In[ ]:


np.zeros(5)


# In[ ]:


np.zeros((3,2))


# RESHAPING MATRICES

# In[ ]:


print(M)
print(M.shape)


# In[ ]:


M2 = np.reshape(M, (4,2))
print(M2)
print(M2.shape)


# In[ ]:


print(V)
print(V.shape)


# In[ ]:


W = np.reshape(V,(2,1))
print(W)
print(W.shape)


# FLATTENING A MATRIX

# In[ ]:


A = np.random.randn(2,4)
B = A.flatten()

print('A = ', np.round(A,2))
print('Flatten of A = ', np.round(B,2))


# ADDING/SUBTRACTING/MULTIPLYING SCALAR TO MATRIX

# In[ ]:


A = np.random.randn(4,4)
n = 10
B = A + n
print('A = ', np.round(A,2))
print('A + ',n,' = ', np.round(B,2))


# In[ ]:


C = A - n
print('A = ', np.round(A,2))
print('A - ',n,' = ', np.round(C,2))


# In[ ]:


D = A * n
print('A = ', np.round(A,2))
print('A * ',n,' = ', np.round(D,1))


# In[ ]:


# ADDING A SCALAR TO SPECIFIC ROW/COLUMN

A[1,:] = A[1,:] + 3 # add to the second row only
print('A = ', np.round(A,2))

A[:,1] = A[:,1] + 3 # add to the second column only
print('A = ', np.round(A,2))


# ADD/SUBTRACT MATRICES

# In[ ]:


A = np.random.randn(3,4)
B = np.random.randn(3,4)
C = A + B
D = A - B
E = B - A

print('A = ', np.round(A,2))
print('B = ', np.round(B,2))
print('A + B = ', np.round(C,2))
print('A - B = ', np.round(D,2))
print('B - A = ', np.round(E,2))


# MULTIPLYING VECTORS
#INNER PRODUCT OF TWO VECTORS: inner & dot
# In[ ]:


a = np.arange(4)
b = np.arange(4)+3
c = np.inner(a,b)
d = np.dot(a,b)
f = np.sum(a * b)

print('a = ', a)
print('b = ', b)
print('a.b = ', c)
print('a.b = ', d)
print('a.b = ', f)

#OUTER PRODUCT OF TWO VECTORS: Given two vectors, a = [a0, a1, ..., aM] and b = [b0, b1, ..., bN], the outer product is:
[[a0*b0  a0*b1 ... a0*bN ]
 [a1*b0    .
 [ ...          .
 [aM*b0            aM*bN ]]
# In[ ]:


np.outer(a,b)


# MULTIPLYING A MATRIX BY A SCALAR

# In[ ]:


A = np.random.randn(3,3)
n = 10
B = A*n
print('A = ', np.round(A,2))
print('B = ', np.round(B,1))


# MULTIPLYING TWO MATRICES
element-wise multiplication
# In[ ]:


A = np.random.randn(5,3)
B = np.random.randn(5,3)

C = A * B

print('A = ', np.round(A,2))
print('B = ', np.round(B,2))
print('A * B = ', np.round(C,2))

print('dimension A = ', A.shape)
print('dimension B = ', B.shape)
print('dimension A * B = ', C.shape)

dot product
# In[ ]:


A = np.random.randn(3,2)
B = np.random.randn(2,4)

# 3 METHODS:

# METHOD 1:
C = A.dot(B)

# METHOD 2:
D = np.dot(A,B)

# METHOD 3:
E = A @ B

print('A = ', np.round(A,2))
print('B = ', np.round(B,2))
print('Method 1: A . B = ', np.round(C,2))
print('Method 2: A . B = ', np.round(D,2))
print('Method 3: A . B = ', np.round(E,2))

print('dimension A = ', A.shape)
print('dimension B = ', B.shape)
print('dimension A . B = ', C.shape)


# DIAGONAL OF A MATRIX: diagonal

# In[ ]:


A_diag = A.diagonal()

print('A = ', A)
print('diagonal  of A is:', A_diag)


# TRACE OF A MATRIX: trace

# In[ ]:


A_trace = A.trace()

print('A = ', A)
print('Trace of A is:', A_trace)


# TRANSPOSING A MATRIX

# In[ ]:


A = np.random.randn(3,4)
A_tran = A.T

print('A = ', np.round(A,2))
print('Transpose of A = ', np.round(A_tran,2))

print('dimension A = ', A.shape)
print('dimension Transpose(A) = ', A_tran.shape)


# # np.linalg 
ADDITIONAL OPERATIONS INCLUDING:
- INVERTING
- DETERMINANT
- RANK 
- EIGENVALUES AND EIGENVECTORS
- NORM


# In[ ]:


from numpy import linalg as LA


# INVERTING A MATRIX

# In[ ]:


A = np.random.randn(4,4)
A = np.round(A,2)


# In[ ]:


A_inv = LA.inv(A)
A_inv = np.round(A_inv, 2)

print('A = ', A)
print('Inverse of A = ', A_inv)

print('dimension A = ', A.shape)
print('dimension Inverse(A) = ', A_inv.shape)


# DETERMINANT OF MATRIX: det

# In[ ]:


print('A = ', A)
print('Shape of Matrix A is:', A.shape)
print('Determinant of Matrix A is:', AL.det(A))


# RANK OF A MATRIX: matrix_rank

# In[ ]:


print('A = ', A)
print('Shape of Matrix A is:', A.shape)
print('Rank of Matrix A is:', AL.matrix_rank(A))


# EIGEN VALUES AND EIGEN VECTORS OF A MATRIX: eig

# In[ ]:


eigenvalues, eigenvectors = LA.eig(A)

print('A = ', A)
print('Eigen values of A:', eigenvalues)
print('Eigen vctors of A:', eigenvectors)


# NORM OF A VECTOR/MATRIX: norm

# In[ ]:


# Vector
a = np.arange(6)
n = LA.norm(a)

print('a = ', a)
print('norm(a) = ', n)


# In[ ]:


# Matrix
A = np.arange(16).reshape(4,4)
N = LA.norm(A)

print('A = ', A)
print('norm(A) = ', N)


# SOLVING LINEAR MATRIX EQUATION OR SYSTEM OF SCALAR EQUATIONS

# Exact solution: solve
If the general form of the system of equations is as :
A.x = b
Given matrix A and vector b, the goal is to computes the exact solution xExample: 
4x1 + 2x2 = 8
-3x1 + 5x2 = 11
# In[ ]:


A = np.array([[4,-3],[2,5]])
b = np.array([8,11])
x = AL.solve(A, b)

for i in range(len(x)):
    print('x'+str(i+1)+' = ',x[i])

To check that the solution is correct: True for correct, False for incorrect
# In[ ]:


if np.allclose(np.dot(A,x),b):
    print('The solution is correct!')
else:
        print('The solution is NOT correct!')


# The Least Square solution: lstsq
If the general form of the system of equations is as :
A.x = b
Solves the equation by computing a vector x that minimizes the Euclidean 2-norm | b - A x |
# In[ ]:


A = np.array([[4,-3],[2,5]])
b = np.array([8,11])
x, res, rnk, s = AL.lstsq(A, b)

print(x)


# In[ ]:





# Add: argmin (Euclidian distance)

# In[ ]:





# SINGULAR VALUE DECOMPOSITION: svd
Singular Value Decomposition (SVD) can be thought of as an extension of the eigenvalue problem to matrices that are not square. Returns:
u :
Unitary array(s). The first a.ndim - 2 dimensions have the same size as those of the input a. The size of the last two dimensions depends on the value of full_matrices. Only returned when compute_uv is True.

s : 
Vector(s) with the singular values, within each vector sorted in descending order. The first a.ndim - 2 dimensions have the same size as those of the input a.

vh : 
Unitary array(s). The first a.ndim - 2 dimensions have the same size as those of the input a. The size of the last two dimensions depends on the value of full_matrices. Only returned when compute_uv is True.
# In[ ]:


A = np.array([[1,2,3],[4,5,6]])
u,s,Vh = LA.svd(A)


# In[ ]:




