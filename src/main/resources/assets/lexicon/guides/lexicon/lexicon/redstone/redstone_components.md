---
navigation:
  title: "Redstone Components"
  icon: "minecraft:redstone_torch"
  position: 2
  parent: lexicon:redstone.md
---

# Redstone Components

__Different categories:__ 

- A __power component__ provides power to other parts of a circuit [eg. *Redstone Torch*] 

- A __transmission component__ passes power from one part of the circuit to another [eg. *Redstone Dust*] 

-  A __mechanism component__ affects the environment (by moving, light, etc..) [eg. *Piston*]

<a name="redstone"></a>
<ItemImage id="minecraft:redstone" />

*Redstone Dust* is the core of redstone mechanics. 

Mined from *Redstone Ore*, the dust can be placed to form redstone wires to carry signals, or crafted into other devices.

<a name="torch"></a>
<ItemImage id="minecraft:redstone_torch" />

*Redstone Torches* can be used to power blocks and transmission components such as *Redstone Dust*, activate mechanism components such as [*Pistons*](#piston), or invert redstone signals like a [*NOT Gate*](./redstone_circuits.md).

##  



<Recipe id="minecraft:redstone_torch" />

<ItemImage id="minecraft:redstone_block" />

A *Redstone Block* acts as a permanently powered redstone power source that can be pushed by [*Pistons*](#piston).

##  



<Recipe id="minecraft:redstone_block" />

<a name="repeater"></a>
<ItemImage id="minecraft:repeater" />

A *Repeater* is a block used in redstone circuits to repeat redstone signals back to full strength, delay signals, prevent signals moving backwards, or to lock signals in one state. 

- Transmits signals only from its back to its front 

- They can repeat a redstone signal, boosting it back up

##  


- *Repeater* delay signals, the delay can be changed by right clicking 
- Repeater can be locked by another powered *Repeater* or *Comparator* facing it's side. When locked, the repeater does not change its output

<Recipe id="minecraft:repeater" />

<a name="comparator"></a>
<ItemImage id="minecraft:comparator" />

A *Comparator* is used to maintain, compare, or subtract signal strength, or to measure certain block states. 
- The back torches turn on when the output is greater than zero. 
- The front torch has two states that can be toggled by using: 
> Down and unpowered (indicating the comparator is in __comparison mode__) 
> Up and powered (indicating the comparator is in __subtraction mode__)

##  


- Can take a signal strength input from its rear as well as from both sides. 

- Side inputs are accepted only from *Redstone Dust*, *Redstone Block*, *Repeaters*, other *Comparators*, & *Observers* in specific scenarios. 
The front is the output.

<Recipe id="minecraft:comparator" />

<ItemImage id="minecraft:stone_button" />

When activated, a *Wooden Button* remains active for 15 redstone ticks (1.5s, barring lag), while a *Stone Button* remains active for 10 redstone ticks (1s, barring lag). 

A *Wooden Button* activated by a fired *Arrow* or a *Trident* remains active until the projectile despawns or is picked up.

##  



<Recipe id="minecraft:stone_button" />

<Recipe id="minecraft:oak_button" />

<a name="lever"></a>
<ItemImage id="minecraft:lever" />

A *Lever* emits redstone power when activated.

##  



<Recipe id="minecraft:lever" />

<a name="pressure_plate"></a>
## Pressure Plates

<ItemImage id="minecraft:stone_pressure_plate" />


- *Wooden Plates* can detect all entities, giving out a signal of 15 

- *Stone Plates* can detect only [*Players*](../creatures/human-player.md) and [*Mobs*](../creatures.md), giving out a signal of 15 

- *Light Weighted Plates* can detect all entities and the signal strength that it outputs increases as more entities are added 

- *Heavy Weighted Plates* measures groups of 10 entities

##  



<Recipe id="minecraft:stone_pressure_plate" />

<Recipe id="minecraft:heavy_weighted_pressure_plate" />

<a name="tripwire"></a>
<ItemImage id="minecraft:tripwire_hook" />

A *Tripwire Hook* can be used to detect [*Mobs*](../creatures.md), *Items*, and other *Entities* over a large area. 

To use it you have to place 2 hooks opposite each other on walls and connect them with *Strings*, now when an entity touches the thread the hooks emit a signal.

##  



<Recipe id="minecraft:tripwire_hook" />

<a name="observer"></a>
<ItemImage id="minecraft:observer" />

A *Observer* detects changes in its target's block states, or the breaking or placing of a block (i.e. changes in its block state). 

This means that changes like the age of *Crops* can be detected because they are part of the block states.

##  



<Recipe id="minecraft:observer" />

<ItemImage id="minecraft:daylight_detector" />

A *Daylight Detector* is a block that outputs a redstone signal based on sunlight. 

The detector can be inverted when *right-clicked*.

##  



<Recipe id="minecraft:daylight_detector" />

<a name="piston"></a>
<ItemImage id="minecraft:piston" />

A *Piston* is capable of pushing blocks, [*Players*](../creatures/human-player.md), and [*Mobs*](../creatures.md) when given a redstone pulse. 

A *Sticky Piston* has the same function as a *Piston* but can also pull the block on its face back when it retracts, unlike the regular one, which leaves the pushed block in place.

##  



<Recipe id="minecraft:piston" />

<Recipe id="minecraft:sticky_piston" />

<a name="dispenser"></a>
<ItemImage id="minecraft:dispenser" />

A *Dispenser* is a block used as a redstone component to dispense items. 

Most items are just thrown out, but a few behave differently (eg. *Armor* equips on a [*Player*](../creatures/human-player.md) of [*Mob*](../creatures.md), projectiles are fired out, *Buckets* or some tools are used, ...)

##  



<Recipe id="minecraft:dispenser" />

<a name="dropper"></a>
<ItemImage id="minecraft:dropper" />

A *Dropper* is a block that can be used to drop items or to push items into another container.

##  



<Recipe id="minecraft:dropper" />

<a name="noteblock"></a>
<ItemImage id="minecraft:note_block" />

A *Note Block* is a musical block that emits sounds when used or powered with redstone. 

- The sound type depends on the block below 
 
- Pressing use on the block increases the note pitch up a semitone.

##  


- A *Note Block* must have air in the space directly above it to play a sound.

<Recipe id="minecraft:note_block" />

<a name="hopper"></a>
<ItemImage id="minecraft:hopper" />

While a *Hopper* is not powered by redstone signals, it operates with three functions: 

- Collect item entities (free-floating items in the world) into its inventory from above it 

- Pull a single item into its inventory from a container above it 

- Push a single item from its own inventory into a container it faces

##  

You can control the direction while aiming at the surface to which its output should face. 

To place a *Hopper* directly on the face of an already interactable block, the [*Player*](../creatures/human-player.md) can sneak while placing the *Hopper*.

<Recipe id="minecraft:hopper" />

<a name="door"></a>
## Doors & Gates

<ItemImage id="minecraft:oak_door" />

*Doors* or *Gates* are blocks that can be used as a barrier that can be opened by hand or with redstone. 

But *Iron Doors* can only be opened with redstone.

##  



<Recipe id="minecraft:oak_door" />

<Recipe id="minecraft:iron_door" />

##  



<Recipe id="minecraft:spruce_trapdoor" />

<Recipe id="minecraft:iron_trapdoor" />

##  



<Recipe id="minecraft:birch_fence_gate" />

<Recipe id="minecraft:jungle_fence_gate" />

<a name="lamp"></a>
<ItemImage id="minecraft:redstone_lamp" />

A *Redstone Lamp* is a block that produces light when activated with a redstone signal.

##  



<Recipe id="minecraft:redstone_lamp" />

<a name="bulb"></a>
<ItemImage id="minecraft:copper_bulb" />

*Copper Bulbs* can be activated to emit light, with the light level emitted decreasing for each stage of oxidation. 
When the bulb receives a redstone pulse, it immediately toggles between its lit and unlit states. 
A [*Comparator*](#comparator) can read the state and it emits a signal strength of 15 if the bulb is lit. 
If the bulb is unlit, the [*Comparator*](#comparator) does not emit any power, allowing this [*Comparator*](#comparator) and *Copper Bulb* combination to act as a compact [T Flip-Flop](./redstone_circuits.md#t-flip-flop).

##  



<Recipe id="minecraft:copper_bulb" />

<Recipe id="minecraft:waxed_copper_bulb_from_honeycomb" />

<ItemImage id="minecraft:trapped_chest" />

A *Trapped Chest* functions as a normal [*Chest*](../useables/chest.md) for item storage, but it produces redstone power when opened. 

It can be visually distinguished from normal [*Chests*](../useables/chest.md) by a red coloration around the latch.

##  



<Recipe id="minecraft:trapped_chest" />

<ItemImage id="minecraft:target" />

A *Target* is a block that provides a temporary redstone charge when hit by a projectile. It also has utility in redstone circuitry for redirecting redstone dust, making it a useful redstone component.

##  



<Recipe id="minecraft:target" />

<ItemImage id="minecraft:crafter" />

When a *Crafter* receives a signal, it ejects one crafted item using the ingredients from the nine inventory slots. 
If the front of a *Crafter* is facing a container (including another *Crafter*), the crafted items are transferred into the container. 
For shaped recipes, the position of the items in the inventory matters.

##  

Because disabled slots prevent items from entering the slot, *Crafters* can be used to craft any item automatically without any input from the [*Player*](../creatures/human-player.md), using a series of [*Hoppers*](#hopper) and/or [*Droppers*](#dropper) & the correct configuration of disabled slots for the recipe.

<Recipe id="minecraft:crafter" />

<ItemImage id="minecraft:detector_rail" />

If the *Minecart* on the *Detector Rail* is a *Minecart* with Chest or *Minecart with Hopper*, an adjacent [*Comparator*](#comparator) facing away from the *Detector Rail* outputs a power level proportional to the container's fullness.

##  



<Recipe id="minecraft:detector_rail" />

<ItemImage id="minecraft:sculk_sensor" />

The *Sculk Sensor* is a block that detects vibrations caused by actions and events, and emits a redstone signal. 

These sensors can also be used to realize wireless redstone mechanics. 

Each vibration in the game falls under a certain [amplitude value](https://minecraft.fandom.com/wiki/Sculk_Sensor#Vibration_Resonance). This value can be measured with a [*Comparator*](#comparator).

##  

 If a *Wool* or *Carpet* is placed between a sensor and a vibration source, the sensor is not able to detect the placed *Wool* nor vibrations behind it. 

*Sculk Sensors* generate within the *Deep Dark* biome and [*Ancient Cities*](../world/structures.md#ancient_city).

<ItemImage id="minecraft:calibrated_sculk_sensor" />

Similarly to its counterpart it detects vibrations, but with twice the range, and can detect multiple vibrations in quicker succession. 

It outputs a signal on all sides except for its input, which can receive power to make the sensor only listen to specific vibrations, depending on the input signal strength.

##  



<Recipe id="minecraft:calibrated_sculk_sensor" />

<a name="command_block"></a>
<ItemImage id="minecraft:command_block" />

A *Command Block* is a block that can execute [*Commands*](../commands.md). 

__There are 3 variants:__ 
- An *Impulse Command Block* is the default block type, it executes only once when activated. 
- A *Chain Command Block* executes every time when triggered. 
- A *Repeating Command Block* executes every game tick as long as it is activated.

##  

<ItemImage id="minecraft:chain_command_block" />

Because it __cannot be obtained or edited in Survival mode without cheats__, it is primarily used on multiplayer servers, in Creative worlds, and custom maps.

<a name="structure_block"></a>
<ItemImage id="minecraft:structure_block" />

A *Structure Block* is used to generate structures manually. 

They can also be used to save and load structures, alongside *Structure Void* blocks.

##  

<ItemImage id="minecraft:structure_void" />

Because it __cannot be obtained or edited in Survival mode without cheats__, it is primarily used on multiplayer servers, in Creative worlds, and custom maps.

