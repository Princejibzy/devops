1. Isblk: lists information about all available or the specified block devices
Create mount point to use it.
2. ﻿﻿﻿sudo file -s /dev/xvdf: Use the file -s command to get information about
a specific device, such as its file system type.
If the output shows simply data, as in the following example output, there is no file system on the device
[ec2-user -I$ sudo file -s /dev/xvdf /dev/xvdf: data
3. ﻿﻿﻿sudo mkfs -t ext4 /dev/xvdf : Creating 4th Extended File System for /dev/xvdf
4. ﻿﻿﻿sudo mkdir /data : Use the mkdir command to create a mount point directory
for the volume. The mount point is where the volume is located in the file system tree and where you read and write files to after you mount the volume.
Imm-
The command creates a directory named /data.
5. sudo mount /dev/vdf /data : mount the volume at the director
