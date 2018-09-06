function Lab1_228()
disp("Table 1")
for p = [false, true]
  for q = [false, true]
    for r = [false, true]
      table1 = xor(p,q) | r;
      disp([p, q, r, table1])
    end
  end
end


