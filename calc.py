Hashset Xintersect = new HashSet(bucketsLength);
      HashSet Yintersect = new HashSet(bucketsLength);

      Iterator zoom = this.iterator();

      while(zoom.hasNext()){
        Object o = zoom.next();
        if(s1.contains(o))
        {
            Yintersect.add(o);
        }
    }
    Iterator zoom2 = Yintersect.iterator();

    while (zoom2.hasNext()) {
        Object p =zoom2.next();
        if(s2.contains(p)) {
            intersect.add(p);
        }
    }
    return intersect;