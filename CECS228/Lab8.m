function pairs=getPairs(vect,cell_arr)
    pairs=[];
    for i=1:size(cell_arr,2)
        temp=cell2mat(cell_arr(i));
        if vect(2)==temp(1)
            pairs=[pairs; [vect(1) ,temp(2)]];
            
        end
    end
end
ex1 = getPairs(['a','b'],{['b','c'],['c','d'],['b','d']});
