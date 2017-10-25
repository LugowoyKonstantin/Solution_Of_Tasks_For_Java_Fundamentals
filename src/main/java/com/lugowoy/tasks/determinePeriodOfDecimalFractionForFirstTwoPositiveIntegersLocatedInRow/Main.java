package com.lugowoy.tasks.determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.DeterminatorSizeOfArray;

/** Created by Konstantin Lugowoy on 03.09.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Integer> array = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels()).create(new FillingArrayIntegerRandomNumbers().fill(sizeArray, 0, 20));

        Determinator determinator = Determinator::determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow;
        determinator.determine(array);

    }

}