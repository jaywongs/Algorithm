import collections

def dfs(src, houses, pipes, visited):
    visited.add(src)
    sink = src
    mind = 999999
    for adj_h in houses[src]:
        mind = min(mind, pipes[src][adj_h])
        if adj_h not in visited:
            sink, tmp = dfs(adj_h, houses, pipes, visited)
            mind = min(mind, tmp)
    return sink, mind


def solve(houses, pipes):
    sources = set(houses.keys())
    houses_inv = collections.defaultdict(set)
    for h in houses:
        for adj_h in houses[h]:
            houses_inv[adj_h].add(h)
            if adj_h in sources:
                sources.remove(adj_h)

    print(len(sources))
    while sources:
        src = sources.pop()
        sink, mind = dfs(src, houses, pipes, set())
        print(src, sink, mind)


for _ in range(int(input())):
    nohouses, nopipes = map(int, input().split())
    houses = collections.defaultdict(set)
    pipes = collections.defaultdict(dict)
    for p in range(nopipes):
        house_a, house_b, d = map(int, input().split())
        houses[house_a].add(house_b)
        pipes[house_a][house_b] = d
    solve(houses, pipes)
