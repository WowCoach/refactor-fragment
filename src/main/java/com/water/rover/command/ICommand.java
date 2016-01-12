package com.water.rover.command;

import com.water.rover.location.Location;

public interface ICommand {
    Location execute(Location location);
}
