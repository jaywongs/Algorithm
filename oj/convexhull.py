class ConvexPt(object):
    def __init__(self, pt, next_pt=None, prev_pt=None):
        self.pt = pt
        self.next_pt = next_pt
        self.prev_pt = prev_pt

    def set_next(self, pt):
        self.next_pt = pt

    def set_prev(self, pt):
        self.prev_pt = pt


_c = ConvexPt((1, 1))
assert _c.pt == (1, 1)


def orientation(p1, p2, p3):
    return ((p2[1] - p1[1]) * (p3[0] - p2[0])) - ((p3[1] - p2[1]) * (p2[0] - p1[0]))


def is_ccw(p1, p2, p3):
    return orientation(p1, p2, p3) < 0


def solve(coor_list, left_pt):
    l = ConvexPt(left_pt)
    cvh_list = []
    cvh_list.append(l.pt)
    p = l

    while True:
        q = next((x for x in coor_list if x != p.pt), None)
        if q is None:
            return []
        for pt in coor_list:
            if pt == q or pt == p.pt:
                continue
            if is_ccw(p.pt, q, pt):
                q = pt

        if l.pt == q:
            break
        cvh = ConvexPt(q, None, p)
        p.set_next(cvh)
        p = cvh
        cvh_list.append(cvh.pt)

    return cvh_list


T = int(input())

while True:
    try:
        N = int(input())
        xy_array = [int(s) for s in input().split()]
        while len(xy_array) < N * 2:
            xy_array += [int(s) for s in input().split()]
        coor_list = []
        left_pt = (1000, 0)

        for i, p in enumerate(xy_array):
            if i % 2 == 0:
                _x = int(p)
            else:
                pt = (_x, int(p))
                if pt[0] < left_pt[0]:
                    left_pt = pt
                coor_list.append(pt)
        ans = -1

        if N > 2:
            cvh = solve(coor_list, left_pt)
            if len(cvh) > 2:
                cvh.sort(key=lambda x: (x[0], x[1]))
                ans = ', '.join(['{} {}'.format(x[0], x[1]) for x in cvh])
        print(ans)
    except EOFError:
        break
