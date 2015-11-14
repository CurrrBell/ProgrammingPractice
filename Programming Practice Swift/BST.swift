//
//  BST.swift
//  
//
//  Created by Christopher Bell on 11/14/15.
//
//

import Foundation

// This program creates a working BST with insert and delete functions

class BST{
    var root: node?
    var size: Int
    var height: Int
    
    init(){
        size = 0
        height = 0
    }
    
    init(r: node){
        root = r
        size = 1
        height = 1
    }
    
    
    
    class node{
        var data: Int
        var parent: node?
        var leftChild: node?
        var rightChild: node?
        
        init(){
            
        }
        
        init(d: Int){
            data = d
        }
        
        func setParent(p: node){
            parent = p
        }
        
        func getParent(){
            return parent
        }
        
        func setLeftChild(lc: node){
            leftChild = lc
        }
        
        func setRightChild(rc: node){
            rightChild = rc
        }
        
        func setData(d: Int){
            data = o
        }
        
        func getData(){
            return data
        }
    }
}