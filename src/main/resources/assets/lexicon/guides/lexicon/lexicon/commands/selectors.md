---
navigation:
  title: "Selectors"
  icon: "minecraft:hopper"
  position: 2
  parent: lexicon:commands.md
---

# Selectors

Target selectors are used in commands to select [*Players*](../creatures/human-player.md) and entities arbitrarily, without needing to specify an exact name. 

One or more entities can be selected with a target selector variable, and targets can be filtered from the selection based on certain criteria using the target selector arguments.

----

*/gamemode creative @a*

**@p** = nearest player 

**@r** = random player 

**@a** = all players 

**@e** = all entities 

**@s** = entity executing the command

-----

## Selector Arguments

After a target selector, optional arguments can be used to narrow down the set of targets to a group that also matches certain criteria. 

- **!** = inverts the argument 
- Arguments can also be stacked 

*/gamemode creative @a[!distance=5]*

*/gamemode creative @a[distance=10,level=13]*

-----

**x**, **y**, **z** = coordinate

**distance** = the distance 

**dx**, **dy**, **dz** = volume dimensions 

**scores** = specific scores 

**tag** = scoreboard tag 

**team** = scoreboard team 

**name** = entity name 

**type** = entity type 

**predicate** = entity predicate 

**x_rotation** = vertical entity rotation 

**y_rotation** = horizontal entity rotation 

**nbt** = entity nbt data 

**level** = XP level 

**gamemode** = player game mode 

**advancements** = advancements 

**limit**, **sort** = trait limit

